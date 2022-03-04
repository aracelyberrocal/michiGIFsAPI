const API_URL = "http://localhost:8080/api/michi";

const title = document.getElementById("title")
const content = document.getElementById("content")
let michiArray = []

function loadAll(){
    axios.get(`${API_URL}`)
        .then(function (response) {
            michiArray = response.data
            for (let i = 0; i < michiArray.length; i++) {
                let gif = document.createElement("div")
                let img = document.createElement("img")
                console.log(michiArray[i].gif_name)
                let imageUrl= michiArray[i].gif_url
                img.setAttribute("src",imageUrl)
                img.setAttribute("id","gifContainer")

                title.innerHTML = "All michi GIF's"
                gif.append(img)
                content.append(gif)
            }
        })
        .catch(function (error) {
            console.log(error);
        })
        .then(function () {
        });
}