import { useState } from "react";

const ContactPage = () => {

    const [nombre, setNombre] = useState('');
    const [correo, setCorreo] = useState('');
    const [mensaje, setMensaje] = useState('');

    const submitMessage = () => {
        try {
            alert("Nombre: " + nombre + "\nCorreo electronico: " + correo + "\nMensaje: " + mensaje + "\n¡Mensaje enviado con exito!");
        } catch (error) {
            alert("Error: " + error.code + " " + error.message);
        }
    }

    return (
        <>
            <main className="container">
                <h1 className="titlePage">¡Envianos tu opinion, critica o comentario a nosotros!</h1>
                <hr />
                <div className="form">
                    <div class="form-group">
                        <label for="nombre">Nombre completo:</label>
                        <input type="text" value={nombre} onChange={(e) => (setNombre(e.target.value))} class="form-control" id="nombre" placeholder="Digite su nombre" />
                    </div>
                    <div class="form-group">
                        <label for="correo">Correo electronico:</label>
                        <input type="email" value={correo} onChange={(e) => (setCorreo(e.target.value))} class="form-control" id="correo" placeholder="Digite su correo electronico" />
                        <small id="emailHelp" class="form-text text-muted">Su correo se la forma en como te mantendremos en contacto.</small>
                    </div>
                    <div class="form-group">
                        <label for="username">Mensaje:</label>
                        <textarea 
                        type="text" value={mensaje} onChange={(e) => (setMensaje(e.target.value))} class="form-control" id="username" placeholder="Digite un nombre de usuario"
                        rows="5" cols="50">

                        </textarea>
                    </div>
                    <div className="container-center">
                        <button onClick={() => submitMessage()} type="submit" class="btn btn-primary">Enviar mensaje</button>
                    </div>
                    <a className="btn btn-secondary" href="/">Volver al inicio</a>
                </div>
            </main>
        </>
    );
}

export default ContactPage;