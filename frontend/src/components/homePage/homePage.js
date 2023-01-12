import Navbar from "../navbarComponent/navbar";
import Footer from "../footerComponent/footer";

const HomePage = () => {
    return (
        <>
            <header>
                <h1>BIBLIOTECA ONLINE</h1>  
            </header>
            <Navbar />
            <div id="banner"></div>
            <Footer />
        </>
    );
}

export default HomePage;