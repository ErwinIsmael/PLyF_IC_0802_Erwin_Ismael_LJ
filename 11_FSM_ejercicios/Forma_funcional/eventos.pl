movimiento(goNorte,goNorte,noCarros).
movimiento(goNorte,goNorte,carrosNorte).
movimiento(goNorte,waitNorte,carrosEste).
movimiento(goNorte,waitNorte,ambosLados).
movimiento(waitNorte,goEste,noCarros).
movimiento(waitNorte,goEste,carrosEste).
movimiento(waitNorte,goEste,carrosNorte).
movimiento(waitNorte,goEste,ambosLados).
movimiento(goEste,goEste,noCarros).
movimiento(goEste,goEste,carrosEste).
movimiento(goEste,waitEste,carrosNorte).
movimiento(goEste,waitEste,ambosLados).
movimiento(waitEste,goNorte,noCarros).
movimiento(waitEste,goNorte,carrosNorte).
movimiento(waitEste,goNorte,carrosEste).
movimiento(waitEste,goNorte,ambosLados).
%L = ["carrosEste","noCarros","carrosEste","carrosNorte","ambosLados"].
estado(ESTADO,[S|E]):- movimiento(ESTADO,X,S),write(movimiento(ESTADO,X)),nl,estado(X,E).

