package co.com.poli.AppRegistroMaterias.model;

import java.util.Objects;

/**
 *
 * @author angel
 */
public class Materia {
    
    private String idMateria;
    private String nombre;
    private String numCreditos;
    private int cupoMin;
    private int cupoMax;

    public Materia(String idMateria, String nombre, String numCreditos, int cupoMin, int cupoMax) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.numCreditos = numCreditos;
        this.cupoMin = cupoMin;
        this.cupoMax = cupoMax;
    }

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(String numCreditos) {
        this.numCreditos = numCreditos;
    }

    public int getCupoMin() {
        return cupoMin;
    }

    public void setCupoMin(int cupoMin) {
        this.cupoMin = cupoMin;
    }

    public int getCupoMax() {
        return cupoMax;
    }

    public void setCupoMax(int cupoMax) {
        this.cupoMax = cupoMax;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.idMateria);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        if (!Objects.equals(this.idMateria, other.idMateria)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
