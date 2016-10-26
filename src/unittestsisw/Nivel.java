package unittestsisw;

public class Nivel {
    
    private int numeroNivel;
    private long puntajeInicio;
    private long puntajeFin;

    public Nivel(int numeroNivel) {
        this.numeroNivel = numeroNivel;
    }

    
    public int getNumeroNivel() {
        return numeroNivel;
    }

    public void setNumeroNivel(int numeroNivel) {
        this.numeroNivel = numeroNivel;
    }

    public long getPuntajeInicio() {
        return puntajeInicio;
    }

    public void setPuntajeInicio(long puntajeInicio) {
        this.puntajeInicio = puntajeInicio;
    }

    public long getPuntajeFin() {
        return puntajeFin;
    }

    public void setPuntajeFin(long puntajeFin) {
        this.puntajeFin = puntajeFin;
    }
    
    
}
