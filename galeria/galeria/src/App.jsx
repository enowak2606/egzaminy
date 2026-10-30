import { useState } from 'react'
import './App.css'
import '../node_modules/bootstrap/dist/css/bootstrap.css';
import { zdjecia as initialZdjecia } from './zdjecia'; // importujemy i zmieniamy nazwę na potrzeby stanu

function App() {
  // Stan przechowujący tablicę zdjęć (dzięki temu modyfikacja odświeża widok)
  const [zdjecia, setZdjecia] = useState(initialZdjecia);

  // Stany przechowujące zaznaczenie przełączników (switch)
  const [pokazKwiaty, setPokazKwiaty] = useState(true);
  const [pokazZwierzeta, setPokazZwierzeta] = useState(true);
  const [pokazSamochody, setPokazSamochody] = useState(true);

  // Funkcja zwiększająca liczbę pobrań dla wybranego zdjęcia
  function pobierzZdjecie(id) {
    const zaktualizowaneZdjecia = zdjecia.map(zdjecie => {
      if (zdjecie.id === id) {
        return { ...zdjecie, downloads: zdjecie.downloads + 1 };
      }
      return zdjecie;
    });
    setZdjecia(zaktualizowaneZdjecia);
  }

  return (
    <div className="container mt-4">
      <h3>Kategorie zdjęć</h3>
      
      {/* Przełączniki powiązane ze stanem za pomocą checked i onChange */}
      <div className="mb-4">
        <div className='form-check-inline form-switch'>
          <input 
            type="checkbox" 
            className='form-check-input' 
            checked={pokazKwiaty} 
            onChange={(e) => setPokazKwiaty(e.target.checked)} 
            id='kwiaty'
          />
          <label className='form-check-label' htmlFor='kwiaty'>Kwiaty</label>
        </div>

        <div className='form-check-inline form-switch'>
          <input 
            type="checkbox" 
            className='form-check-input' 
            checked={pokazZwierzeta} 
            onChange={(e) => setPokazZwierzeta(e.target.checked)} 
            id='zwierzeta'
          />
          <label className='form-check-label' htmlFor='zwierzeta'>Zwierzęta</label>
        </div>

        <div className='form-check-inline form-switch'>
          <input 
            type="checkbox" 
            className='form-check-input' 
            checked={pokazSamochody} 
            onChange={(e) => setPokazSamochody(e.target.checked)} 
            id='samochody'
          />
          <label className='form-check-label' htmlFor='samochody'>Samochody</label>
        </div>
      </div>

      {/* Galeria generowana dynamicznie na podstawie stanu */}
      <div id='galeria' className='d-flex flex-wrap'>
        {zdjecia
          .filter(zdjecie => {
            if (zdjecie.category === 1 && pokazKwiaty) return true;
            if (zdjecie.category === 2 && pokazZwierzeta) return true;
            if (zdjecie.category === 3 && pokazSamochody) return true;
            return false;
          })
          .map(zdjecie => (
            <div key={zdjecie.id} className="p-2 border bg-light m-2" style={{ width: '320px' }}>
              <img 
  src={new URL(`./assets/${zdjecie.filename}`, import.meta.url).href} 
  alt={zdjecie.alt} 
  className="zdjecie-galeria w-100" 
  style={{ borderRadius: '8px', margin: '5px 0', height: '200px', objectFit: 'cover' }}
/>
              <h4 className="mt-2">Pobrań: {zdjecie.downloads}</h4>
              <button 
                className="btn btn-success" 
                onClick={() => pobierzZdjecie(zdjecie.id)}
              >
                Pobierz
              </button>
            </div>
          ))}
      </div>
    </div>
  )
}

export default App;