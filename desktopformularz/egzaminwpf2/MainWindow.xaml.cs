using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace egzaminwpf2
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        //funkcja przycisku podglądu, uruchamia się po kliknięciu i otwiera podgląd danych w oknie MessageBox
        private void Podglad_Click(object sender, RoutedEventArgs e)
        {
            String akceptacja = "Nie";
            if (inputRegulamin.IsChecked == true)
            {
                akceptacja = "Tak";
            }
            else
            {
                akceptacja = "Nie";
            }
            MessageBox.Show("Twoje dane: \n" + "Imię: "+inputImie.Text+"\nNazwisko: "+inputNazwisko.Text+"\nWiek: "+inputWiek.Text+"\nAkceptowany regulamin: "+akceptacja);
        }

        //funkcja wyczysc, czysci formularz i blokuje przycisk wyslij poprzez ustawienie akceptacji regulaminu i pelnoletniosci na false
        public void Wyczysc()
        {
            inputImie.Text = null;
            inputNazwisko.Text = null;
            inputWiek.Text = null;
            inputRegulamin.IsChecked = false;
            pelnoletniosc = false;
            regulaminAkceptacja = false;
            BlokadaPrzycisku();
        }

        //funkcja przycisku wyczysc, uruchamia sie po kliknieciu i wykonuje funkcje wyczysc
        private void Wyczysc_Click(object sender, RoutedEventArgs e)
        {
            Wyczysc();
        }

        //funkcja przycisku Wyslij, uruchamia się po kliknięciu, wyswietla MessageBox z wyslanymi danymi, oraz czysci formularz
        private void Wyslij_Click(object sender, RoutedEventArgs e)
        {
            String akceptacja = "Nie";
            if (inputRegulamin.IsChecked == true)
            {
                akceptacja = "Tak";
            }
            else
            {
                akceptacja = "Nie";
            }
            MessageBox.Show("Wysłano następujące dane: \n" + "Imię: " + inputImie.Text + "\nNazwisko: " + inputNazwisko.Text + "\nWiek: " + inputWiek.Text + "\nAkceptowany regulamin: " + akceptacja);
            Wyczysc();
        }

        //zmienne pomocnicze, wykorzystywane do wylaczenia lub wlaczenia klikalnosci przycisku Wyslij
        bool pelnoletniosc = false;
        bool regulaminAkceptacja = false;

        //funkcja pola tekstowego Wiek, uruchamia sie po zmianie tekstu w polu, ustawia wartosc zmiennych pomocniczych na true lub false, a nastepnie blokuje lub odblokowuje przycisk poprzez
        //wywolanie funkcji BlokadaPrzycisku. Dodatkowo obsluguje blad jakim jest wpisanie niedozwolonych znakow w pole wiek.
        private void InputWiek_TextChanged(object sender, TextChangedEventArgs e)
        {
            try
            {
                int wiekWartosc = int.Parse(inputWiek.Text);
                if(wiekWartosc >= 18)
                {
                    pelnoletniosc = true;
                }
                else
                {
                    pelnoletniosc = false;
                }
                BlokadaPrzycisku();


            }
            catch (Exception ex)
            {
                if (!string.IsNullOrEmpty(inputWiek.Text))
                {
                    MessageBox.Show("Wpisz wiek liczbowo");
                }
            }
        }

        //funkcja pola wyboru akceptacji regulaminu, uruchamia sie po kliknieciu (zaznaczeniu lub odznaczeniu wyboru), ustawia wartosc zmiennych pomocniczych na true lub false, a
        //nastepnie blokuje lub odblokowuje przycisk poprzez wywolanie funkcji BlokadaPrzycisku.
        private void InputRegulamin_Click(object sender, RoutedEventArgs e)
        {
           
            if (inputRegulamin.IsChecked == true)
            {
                regulaminAkceptacja = true;
            }
            else
            {
                regulaminAkceptacja = false;
            }
            BlokadaPrzycisku();
        }

        //funkcja BlokadaPrzycisku, blokuje lub odblokowuje przycisk na podstawie wartosci zmiennych pomocniczych
        public void BlokadaPrzycisku()
        {
            if (pelnoletniosc && regulaminAkceptacja)
            {
                wyslij.IsEnabled = true;
            }
            else
            {
                wyslij.IsEnabled = false;
            }
        }


    }
}