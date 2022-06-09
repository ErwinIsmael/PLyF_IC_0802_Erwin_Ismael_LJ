esPato(donald).
esPato(lucas).
esPato(bill).
esPato(S) :- sobrino(S,T), esPato(T).
esPato(S) :- tienePlumas(S), haceCuac(S).
sobrino(mcquack,donald).
sobrino(plucky,bill).
tienePlumas(piolin).
tienePlumas(daisy).
haceCuac(daisy).
