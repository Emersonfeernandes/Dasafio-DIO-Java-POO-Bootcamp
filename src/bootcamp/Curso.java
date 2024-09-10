package bootcamp;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public double calcularXp(){
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: " +
                "titulo: '" + getTitulo() + '\'' +
                ", \ndescricao: '" + getDescricao() + '\'' +
                ", \ncarga Horaria: " + cargaHoraria +
                "\n================================\n";
    }

    

}
