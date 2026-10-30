import { useState } from 'react'
import heroImg from './assets/hero.png'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import './App.css'
import 'bootstrap/dist/css/bootstrap.css';

function App() {
    const kursy = [{"tytul":"Programowanie w C#"}, {"tytul":"Angular dla poczatkujacych"},{"tytul":"Kurs Django"}];
    const [imieNazwisko, setImieNazwisko] = useState('');
    const [nrKursu, setNrKursu] = useState('');

    function zapisz(){
      console.log(imieNazwisko.toString());
      if(nrKursu>0 && nrKursu < kursy.length+1){
        console.log(kursy[nrKursu-1].tytul.toString());
      }else{
        console.log("NIeprawidowy nr")
      }
    }
    
  return (
    <>
      <h2>Liczba kursów: {kursy.length}</h2>
      <div className='mb-3'>
      <ol>
        {
          kursy.map((kurs, index) => (
            <li key={index}>{kurs.tytul}</li>
          ))
        }
      </ol>
      </div>
        <div className='mb-3'>
          <label htmlFor='inputimie'>Imię i nazwisko:</label>
          <input id='inputimie' type="text" value={imieNazwisko} onChange={(e) => setImieNazwisko(e.target.value)} className='form-control' />
          </div>
          <div className='mb-3'>
          <label htmlFor="inputkurs">Numer kursu:</label>
          <input type="number" id="inputkurs" value={nrKursu} onChange={(e) => setNrKursu(e.target.value)} className='form-control' />
          </div>
          <button className='btn btn-primary' id='przycisk' onClick={()=>{zapisz()}}>Zapisz do kursu</button>
    </>
  )
}

export default App
