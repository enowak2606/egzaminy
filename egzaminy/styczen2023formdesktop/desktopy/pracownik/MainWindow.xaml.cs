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

namespace pracownik
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
        StringBuilder haslo;


        private void GenerujHasloButton_Click(object sender, RoutedEventArgs e)
        {
            String zbiorCyfry = "0123456789";
            String zbiorZnakiSpecjalne = "!@#$%^&*()_+-=";
            String zbiorAlfabetMaleIWielkie = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

            int dlugoscHasla = int.Parse(ZnakiTextBox.Text);
            bool maleWielkieLitery = MaleIWielkieLiteryCheckBox.IsChecked ?? false;
            bool cyfry = CyfryCheckBox.IsChecked ?? false;
            bool znakiSpecjalne = ZnakiSpecjalneCheckBox.IsChecked ?? false;

            haslo = new StringBuilder();

            Random random = new Random();

            int i = 0;
            
            while(i< dlugoscHasla) {


                if (cyfry)
                {
                    haslo.Append(zbiorCyfry[(int)random.NextInt64(zbiorCyfry.Length)]);
                    i++;
                }

                if (znakiSpecjalne)
                {
                    haslo.Append(zbiorZnakiSpecjalne[(int)random.NextInt64(zbiorZnakiSpecjalne.Length)]);
                }

                if (maleWielkieLitery)
                {
                    haslo.Append(zbiorAlfabetMaleIWielkie[(int)random.NextInt64(zbiorAlfabetMaleIWielkie.Length)]);
                    i++;
                }

                if (haslo.Equals(""))
                {
                    MessageBox.Show("Prosze zaznaczyc checkboxy");
                    return;
                }
            }

            MessageBox.Show(haslo.ToString());




        }

        private void ZatwierdzButton_Click(object sender, RoutedEventArgs e)
        {

            String imie = ImieTextBox.Text;
            String nazwisko = NazwiskoTextBox.Text;
            String stanowisko = StanowiskoComboBox.Text;


            MessageBox.Show("Dane pracownika: " + imie + " " + nazwisko + " " + stanowisko + " Hasło: " + haslo.ToString());

        }
    }
}