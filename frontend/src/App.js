import './App.css';
import { Routes, Route } from 'react-router-dom';

//Pages
import HomePage from './components/homePage/homePage';
import ContactPage from './components/contactPage/contactPage';
import OfferPage from './components/offerPage/offerPage';
import CataloguePage from './components/cataloguePage/cataloguePage';

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path='/' element={<HomePage />}/>
        <Route path='/contact' element={<ContactPage />}/>
        <Route path='/dayoffer' element={<OfferPage />}/>
        <Route path='/catalogue' element={<CataloguePage />}/>
      </Routes>
    </div>
  );
}

export default App;
