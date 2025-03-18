document.addEventListener("DOMContentLoaded", () => {
    fetch("http://localhost:8080/api/movies")
        .then(response => response.json())
        .then(data => {
            const movieList = document.getElementById("movie-list");
            data.forEach(movie => {
                let row = `<tr>
                    <td>${movie.title}</td>
                    <td>${movie.genre}</td>
                    <td>${movie.year}</td>
                </tr>`;
                movieList.innerHTML += row;
            });
        })
        .catch(error => console.error("Lỗi khi lấy dữ liệu:", error));
});
