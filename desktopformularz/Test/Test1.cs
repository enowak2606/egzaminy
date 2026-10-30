using egzaminwpf2;
using System;
using System.Windows.Controls;
namespace Test
{
    [TestClass]
    public sealed class Test1
    {
        [DoNotParallelize]
        [STATestMethod]
        public void WiekDorosly()
        {
            MainWindow mainWindow = new MainWindow();
            mainWindow.inputRegulamin.IsChecked = true;
            mainWindow.inputWiek.Text = "19";
            Button przyciskWyslij = mainWindow.wyslij;
            
            Assert.IsTrue(przyciskWyslij.IsEnabled);
        }

        [DoNotParallelize]
        [STATestMethod]
        public void SprawdzanieLiter()
        {
            MainWindow mainWindow = new MainWindow();
            mainWindow.inputWiek.Text = "abc";
            mainWindow.inputRegulamin.IsChecked = true;
            Button przyciskWyslij = mainWindow.wyslij;  

            Assert.IsFalse(przyciskWyslij.IsEnabled);
        }

        [DoNotParallelize]
        [STATestMethod]
        public void WiekNiepelnoletni()
        {
            MainWindow mainWindow = new MainWindow();
            mainWindow.inputRegulamin.IsChecked = true;
            mainWindow.inputWiek.Text = "16";
            Button przyciskWyslij = mainWindow.wyslij;

            Assert.IsFalse(przyciskWyslij.IsEnabled);
        }

        [DoNotParallelize]
        [STATestMethod]
        public void WyczyscWylaczaPrzycisk()
        {
            MainWindow mainWindow = new MainWindow();
            mainWindow.inputRegulamin.IsChecked = true;
            mainWindow.inputWiek.Text = "19";
            mainWindow.inputNazwisko.Text = "Kowalski";
            mainWindow.inputImie.Text = "Jan";
            mainWindow.Wyczysc();

            Assert.IsFalse(mainWindow.wyslij.IsEnabled);
        }

        [DoNotParallelize]
        [STATestMethod]
        public void WyczyscOdznaczaCheckboxa()
        {
            MainWindow mainWindow = new MainWindow();
            mainWindow.inputRegulamin.IsChecked = true;
            mainWindow.Wyczysc();

            Assert.IsFalse(mainWindow.inputRegulamin.IsChecked);
        }
    }
}
