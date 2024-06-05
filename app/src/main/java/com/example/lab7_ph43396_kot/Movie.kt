package com.example.lab7_ph43396_kot

data class Movie(
    val title: String,
    val year: String,
    val posterUrl: String,
    val duration : Int,
    val releaseDate : String,
    val genre : String,
    val shotDescription : String
) {
    companion object {
        fun getSampleMovies(): MutableList<Movie> {
            val listMovie = mutableListOf<Movie>()
            listMovie.add(Movie("Doraemon","2024",
                "https://1.bp.blogspot.com/-acQu-aEV3e0/VB_COpGIExI/AAAAAAAAD7c/oFEOHqO4W34/s1600/how%2Bto%2Bdraw%2Bdoraemon%2Bcartoon.jpg",
                156, "22/5/2024","Anime","Phim doramon,Phim doramon,Phim doramon,Phim doramon,Phim doramon,Phim doramon,"))
            listMovie.add(Movie("Nobita","2023",
                "https://i.pinimg.com/originals/c8/56/c6/c856c6c7dd0fe634738ea1fce7526609.jpg",
                156, "22/5/2024","Phim Hài","Phim doramon,Phim doramon,Phim doramon,Phim doramon,Phim doramon,Phim doramon,"))
            listMovie.add(Movie("Doraemon","2024",
                "https://1.bp.blogspot.com/-acQu-aEV3e0/VB_COpGIExI/AAAAAAAAD7c/oFEOHqO4W34/s1600/how%2Bto%2Bdraw%2Bdoraemon%2Bcartoon.jpg",
                156, "22/5/2024","Anime","Phim doramon,Phim doramon,Phim doramon,Phim doramon,Phim doramon,Phim doramon,"))
            listMovie.add(Movie("Nobita","2023",
                "https://i.pinimg.com/originals/c8/56/c6/c856c6c7dd0fe634738ea1fce7526609.jpg",
                156, "22/5/2024","Phim Hài","Phim doramon,Phim doramon,Phim doramon,Phim doramon,Phim doramon,Phim doramon,"))

            listMovie.add(Movie("Doraemon","2024",
                "https://1.bp.blogspot.com/-acQu-aEV3e0/VB_COpGIExI/AAAAAAAAD7c/oFEOHqO4W34/s1600/how%2Bto%2Bdraw%2Bdoraemon%2Bcartoon.jpg",
                156, "22/5/2024","Anime","Phim doramon,Phim doramon,Phim doramon,Phim doramon,Phim doramon,Phim doramon,"))
            listMovie.add(Movie("Nobita","2023",
                "https://i.pinimg.com/originals/c8/56/c6/c856c6c7dd0fe634738ea1fce7526609.jpg",
                156, "22/5/2024","Phim Hài","Phim doramon,Phim doramon,Phim doramon,Phim doramon,Phim doramon,Phim doramon,"))

            listMovie.add(Movie("Doraemon","2024",
                "https://1.bp.blogspot.com/-acQu-aEV3e0/VB_COpGIExI/AAAAAAAAD7c/oFEOHqO4W34/s1600/how%2Bto%2Bdraw%2Bdoraemon%2Bcartoon.jpg",
                156, "22/5/2024","Anime","Phim doramon,Phim doramon,Phim doramon,Phim doramon,Phim doramon,Phim doramon,"))
            listMovie.add(Movie("Nobita","2023",
                "https://i.pinimg.com/originals/c8/56/c6/c856c6c7dd0fe634738ea1fce7526609.jpg",
                156, "22/5/2024","Phim Hài","Phim doramon,Phim doramon,Phim doramon,Phim doramon,Phim doramon,Phim doramon,"))

            return listMovie
        }
    }
}