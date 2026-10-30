import { useState } from 'react'
import './App.css'
import 'bootstrap/dist/css/bootstrap.min.css'

const kursy = [{"tytul": "Programowanie w C#"}, {"tytul": "Angular dla początkujących"}, {"tytul": "Kurs Django"}] 

function App() {

const [imieNazwisko, setImieNazwisko] = useState('');
const [numerKursu, setNumerKursu] = useState('');

function handleClick(){
  console.log(imieNazwisko.toString())
  if(numerKursu>0&&numerKursu<kursy.length+1){
    console.log(kursy[numerKursu-1].tytul.toString())
  }else{
    console.log("Nieprawidłowy numer kursu")
  }
}

  return (
    <>
      <section id="center">
        <h2>Liczba kursów: {kursy.length}</h2>
        <ol >
          {
            kursy.map((kurs, index) => (
              <li key={index}>{kurs.tytul}</li>
            ))
          }
        </ol>


       <div className='mb-3'>
         <label>Imię i nazwisko:</label>

        <input type="text"
        value={imieNazwisko} 
        onChange={(e) => setImieNazwisko(e.target.value)}
        className='form-control'/>
       </div>

        <div className='mb-3'>
          <label>Numer kursu: </label>

          <input type="number" 
          value={numerKursu} 
          onChange={(e) => setNumerKursu(e.target.value)}
          className='form-control'/>
        </div>

        <button onClick={()=>{handleClick()}} className='btn btn-primary'>Zapisz do kursu</button>
      </section>
    </>
  )
}


export default App
