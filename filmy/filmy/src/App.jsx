import { useState } from 'react'
import heroImg from './assets/hero.png'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import './App.css'
import '../node_modules/bootstrap/dist/css/bootstrap.css'

function App() {
  const [tytul, setTytul] = useState("");
  const [rodzaj, setRodzaj] = useState("");

  function wypisanieDanych(){
    console.log("tytuł: "+tytul+", rodzaj: "+rodzaj)
  }

  return (
    <>
      <div className='mb-3'>
        <label htmlFor='tytul'>Tytuł Filmu</label><br/>
        <input type="text" id="tytul" className='form-control' value={tytul} onChange={(e) => setTytul(e.target.value)}/>
      </div>
      <div className='mb-3'>
        <label htmlFor="rodzaj">Rodzaj</label><br/>
        <select className='form-control' value={rodzaj} onChange={(e) => setRodzaj(e.target.value)}>
          <option></option>
          <option value="1">Komedia</option>
          <option value="2">Obyczajowy</option>
          <option value="3">Sensacyjny</option>
          <option value="4">Horror</option>
        </select>
      </div>
      <button className='btn btn-primary' onClick={() => {wypisanieDanych()}}>Dodaj</button>
    </>
  )
}

export default App
