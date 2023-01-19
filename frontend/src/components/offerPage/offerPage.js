import Book from "../models/book";
import Navbar from "../navbarComponent/navbar";
import Footer from "../footerComponent/footer";

const OfferPage = () => {

    const discount = useDiscount();

    //Custom hook
    function useDiscount() {
        let discount = Math.floor(Math.random() * (100 - 10 + 1)) + 10;
        return discount;
    }

    return (
        <>
            <h1 className="titlePage">¡OFERTA ESPECIAL DEL DIA!</h1>
            <Navbar />
            <div className="container-offer">
                <br></br>
                <p>Compra este libro con un descuento de:</p>
                <h1>{discount}%</h1>
            </div>
            <Book id={"52"} />
            <Footer />
        </>
    );
}

export default OfferPage;