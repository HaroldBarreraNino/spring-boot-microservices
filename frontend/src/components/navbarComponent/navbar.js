import { Link } from "react-router-dom";

const Navbar = () => {
    return (
        <>
            <nav>
                <ul>
                    <li>
                        <Link to='/' className="routelink">Inicio</Link>
                    </li>
                </ul>
                <ul>
                    <li>
                        <Link to='/catalogue' className="routelink">Catalogo</Link>
                    </li>
                </ul>
                <ul>
                    <li>
                        <Link to='/dayoffer' className="routelink">¡Oferta del dia!</Link>
                    </li>
                </ul>
                <ul>
                    <li>
                        <Link to='/contact' className="routelink">Contactanos</Link>
                    </li>
                </ul>
            </nav>
            <div className='clearfix'></div>
        </>
    );
}

export default Navbar;