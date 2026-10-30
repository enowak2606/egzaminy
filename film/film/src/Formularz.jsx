import 'bootstrap/dist/css/bootstrap.css';
function Formularz(){
    const przycisk = document.querySelector('#przycisk');

    const klikniecie = () => {
        const tytul = document.querySelector('#tytulFilmu').value;
        const rodzaj = document.querySelector('#rodzaj').value;
        console.log("tytul: "+tytul+"; rodzaj: "+rodzaj);
        
    };

    return(
        <div className='form-group'>
            <label htmlFor="tytulFilmu">Tytuł filmu</label><br/>
            <input type="text" id="tytulFilmu" className='form-control'></input><br/>

            <label htmlFor="rodzaj">Rodzaj</label><br/>
            <select id="rodzaj" className='form-control'>
                <option value=""></option>
                <option value="1">Komedia</option>
                <option value="2">Obyczajowy</option>
                <option value="3">Sensacyjny</option>
                <option value="4">Horror</option>
            </select><br/>
            <button id="przycisk" onClick={klikniecie} className='btn btn-primary'>Dodaj</button>
        </div>
    );
}
export default Formularz;