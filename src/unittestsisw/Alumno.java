package unittestsisw;

public class Alumno {

    private Nivel nivelAlumno = new Nivel(0);

    public Nivel getNivelAlumno() {
        return nivelAlumno;
    }

    public void setNivelAlumno(Nivel nivelAlumno) {
        this.nivelAlumno = nivelAlumno;
    }
    
    public void subirNivel(){
        int nivelActual = this.getNivelAlumno().getNumeroNivel();
        Nivel nuevoNivel = new Nivel(nivelActual+1);
        this.setNivelAlumno(nuevoNivel);
        
    }
}
