import { useEffect, useState } from "react";
import { LibroService } from "../../services/LibroService";

//Este es un modelo de plantilla. El modelo final tendra mas atributos dependiendo de la base de datos que se desarrole
function Book({ id }) {

    const service = new LibroService();
    const [titulo, setTitulo] = useState("");
    const [descripcion, setDescripcion] = useState("");
    const [imagen, setImagen] = useState("");

    useEffect(() => {
        const obtenerInformacion = () => {
            service.getLibro(id).then(libro => {
                setTitulo(libro.titulo);
                setDescripcion(libro.descripcion);
                setImagen(libro.imagen)
            });
        }

        obtenerInformacion();

    }, [id]);

    return (
        <div className="container-card">
            <div className="container-center">
                <ul>
                    <li id="titleitem">{titulo}</li>
                    <li>
                        <img src={imagen} />
                    </li>
                    <li>
                        Sinopsis:
                        <p>{descripcion}</p>
                    </li>
                </ul>
            </div>
        </div>
    );
}

export default Book;