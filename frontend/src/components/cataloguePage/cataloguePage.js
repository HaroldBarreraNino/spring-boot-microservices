import { useEffect, useState } from "react";
import Book from "../models/book";
import Navbar from "../navbarComponent/navbar";
import Footer from "../footerComponent/footer";
import { LibroService } from "../../services/LibroService";

const CataloguePage = () => {

    const service = new LibroService();
    const [datalibros, setDatalibros] = useState([]);
    let librosarray = new Array();

    useEffect(() => {
        const getCatalogo = () => {

            service.getAllLibros().then(data => {
                setDatalibros(data);
            })

            console.log(datalibros);
        }

        getCatalogo();
    }, []);

    const galeria = datalibros.map(libro => {
        return (
            <div>
                <Book id={libro.idlibro} />
            </div>
        );
    })

    return (
        <>
            <h1 className="titlePage">CATALOGO</h1>
            <Navbar />
            {galeria}
            <Footer />
        </>
    );
}

export default CataloguePage;