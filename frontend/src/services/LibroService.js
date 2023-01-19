import axios from "axios";

export class LibroService{
    baseUrl = "http://localhost:80/api/operador/"

    getAllLibros(){
        return axios.get(this.baseUrl + "libros")
        .then(res => res.data);
    }

    getLibro(id){
        return axios.get(this.baseUrl + "libro/" + id)
        .then(res => res.data);
    }
}