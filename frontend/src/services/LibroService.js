import axios from "axios";

export class LibroService{
    buscadorUrl = "http://localhost:90/api/buscador/"
    operadorUrl = "http://localhost:80/api/operador/"

    getAllLibros(){
        return axios.get(this.buscadorUrl + "libros")
        .then(res => res.data);
    }

    getLibro(id){
        return axios.get(this.buscadorUrl + "libro/" + id)
        .then(res => res.data);
    }
}