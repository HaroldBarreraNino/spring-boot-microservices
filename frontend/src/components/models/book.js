import { useState } from "react";

//Este es un modelo de plantilla. El modelo final tendra mas atributos dependiendo de la base de datos que se desarrole
function Book({ titulo, descripcion, imagen }) {

    //Hooks useStates por si a futuro se planea juntar con una base de datos, por ahora son datos estaticos
    /*const [titulo, setTitulo] = useState(titulo);
    const [descripcion, setDescripcion] = useState(descripcion);
    const [imagen, setImagen] = useState(imagen);*/

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