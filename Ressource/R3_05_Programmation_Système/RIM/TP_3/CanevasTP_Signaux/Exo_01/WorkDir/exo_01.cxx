/**
 *
 * @File : 
 *
 * @Author : A. B. Dragut
 *
 * @Synopsis : modelmain
 **/

#include <string>
#include <exception>
#include <iostream>    

#include <unistd.h>     // getdtablesize()
#include <sys/time.h>   // fd_set

#include "nsSysteme.h"
#include "CExc.h"

using namespace nsSysteme;
using namespace std;
namespace {

    void Derout(int numeroSignal) {
    cout << "Recu signal " << numeroSignal << " signifiant " << strsignal(numeroSignal) << endl ;
    }
}

int main(int argc, char * argv [])
{
  try {
        // Pour tous les signaux
        for (int numSign=1; numSign <= CstSigMax -1; numSign++) {
            
            if (numSign != SIGKILL && numSign!=SIGSTOP ) {
                switch (argv[1][0]) {
                    // particulier
                    case 'P':
                        cout<< "Signal " << numSign << " : " << Signal(numSign, Derout) << "\n";
                        break;
                    // Ignorer
                    case 'I':
                        cout<< "Signal " << numSign << " : " <<Signal(numSign, SIG_IGN) << "\n";
                        break;
                    // Défaut
                    case 'D':
                        cout<< "Signal " << numSign << " : " <<Signal(numSign, SIG_DFL) << "\n";
                        break;
                    // option inconnue
                    default :
                        cout << "Argument doit etre seulement P, I ou D" <<endl ;
                }        
            }
            else
                cout<< "Signal " << numSign << " : interdit \n" ;
        }
        
        // boucle infinie
        while (true) {
            
        }
        
        return 0;
        
        
        
        
        

///code
    return 0;
  }
  catch (const CExc & Exc) {
        cerr <<Exc<< endl;
        return errno;
  }
  catch (const exception & Exc) {
        cerr << "Exception : " << Exc.what () << endl;
        return 1;
  }
  catch (...) {
        cerr << "Exception inconnue recue dans la fonction main()" 
             << endl;
        return 1;
  }


}  //  main()

