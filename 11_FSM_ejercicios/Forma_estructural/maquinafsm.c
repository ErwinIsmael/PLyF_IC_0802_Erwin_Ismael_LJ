/*
|------------------------------------------------------------------------------
|Evento         |     00     |       01        |     10       |      11       |
|GO_NORTE         GO_NORTE       WAIT_NORTE       GO_NORTE        WAIT_NORTE
|WAIT_NORTE       GO_ESTE        GO_ESTE          GO_ESTE         GO_ESTE
|GO_ESTE          GO_ESTE        GO_ESTE          WAIT_eSTE       WAIT_ESTE
|WAIT_ESTE        GO_NORTE       GO_NORTE         GO_NORTE        GO_NORTE  
|
|




*/





#include <stdio.h>
#include <stdlib.h>
#include <windows.h>

#define GO_NORTE    2
#define WAIT_NORTE    3
#define GO_ESTE    4
#define WAIT_ESTE    5
//#define estado   1

#define NO_CARROS   00
#define CARROS_ESTE   01
#define CARROS_NORTE   10
#define AMBOS_LADOS   11


int main(){



 // int NO_CARROS=1, CARROS_ESTE=2, CARROS_NORTE=3, AMBOS_LADOS=4;
  //int GO_NORTE=2, WAIT_NORTE=3, GO_ESTE=4, WAIT_ESTE=5;
   
   //int estado = GO_NORTE;
    int estado=GO_NORTE;
   //int eventos [5]={00,01,10,11,00};
   int i,n;
printf("Ingrese el numero de eventos a realizar (Digite unicamente numeros): \n");
  scanf("%d",&n);
  int eventos[n];
for ( i = 0; i < n; ++i)
{
  /* code */
  printf("\nEventos:\nNO_CARROS: 00\nCARROS_ESTE: 01\nCARROS_NORTE: 10\nAMBOS_LADOS: 11\n Digite unicamente numeros (Ejemplo: 00)\n");
  printf("Ingrese el evento [%d]: \n",i+1);
  scanf("%d",&eventos[i]);
}


printf("\n ----> Comienza a avanzar <----------- \n");

   for (i = 0; i < n ; i++)
   {
    switch(estado){
      case GO_NORTE:
      
      if( NO_CARROS == eventos[i] || CARROS_NORTE == eventos[i]){
          
          estado=GO_NORTE;
          //estado==GO_NORTE;
          printf("\nAvanza A GO_NORTE\n");
          Sleep(3000);
      }else if( CARROS_ESTE == eventos[i] || AMBOS_LADOS == eventos[i]){
        
        estado=WAIT_NORTE;
        //estado==WAIT_NORTE;
        printf("\nAvanza A WAIT_NORTE\n");
        Sleep(2000);
        } else{
          printf("\n Ninguna ruta encontrada \n");
          i=n+1;
        }
    break;

    case WAIT_NORTE:    
     if( NO_CARROS == eventos[i] || CARROS_ESTE == eventos[i]  || CARROS_NORTE==eventos[i]  || AMBOS_LADOS == eventos[i]){        
        estado=GO_ESTE;
        printf("\nAvanza a GO_ESTE \n");
        Sleep(3000);
      }else{
          printf("\n Ninguna ruta encontrada \n");
          i=n+1;
        }
    break;
    case GO_ESTE:
      if(NO_CARROS== eventos[i] || CARROS_ESTE == eventos[i]){
          estado=GO_ESTE;          
    printf("\n Avanza a GO_ESTE \n");   
    Sleep(3000);   
      }else if(CARROS_NORTE == eventos[i] || AMBOS_LADOS == eventos[i]){        
        estado=WAIT_ESTE;      
        printf("\n Avanza a WAIT_ESTE\n");
        Sleep(2000);
      }else{
          printf("\n Ninguna ruta encontrada \n");
          i=n+1;
        }
      break;

      case WAIT_ESTE:            
      if(NO_CARROS == eventos[i] || CARROS_ESTE == eventos[i] || CARROS_NORTE == eventos[i] || AMBOS_LADOS == eventos[i]){
        estado=GO_NORTE;        
        printf("\n Avanza a GO_NORTE \n");
        Sleep(3000);
        }else{
          printf("\n Ninguna ruta encontrada \n");
          i=n+1;
        }
      break;

      default:
      printf("\n Ningun recorrida mas");
      i=n+1;
      break;
      
      }
    }

  return 0;
  }

