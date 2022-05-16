package pt.c40task.l05wumpus;

public class Heroi extends Componente {
    private static final int priority = 3;
    private static final char representation = 'P';
    private int arrows;
    private boolean arrowEquiped;
    private boolean foundGold;

    public int getPriority(){
        return Heroi.priority;
    }

    public char toChar(){
        return Heroi.representation;
    }

    public Heroi(Coordenada coord, int arrows, boolean arrowEquiped){
        this.setCoord(coord);
        this.arrows = arrows;
        this.arrowEquiped = arrowEquiped;
    }

    public Heroi(){
        this(new Coordenada(1, 1), 1, false);
    }

    public void mv(Coordenada dest){
        this.rm();
        this.setCoord(dest);
        this.add();
        if (arrowEquiped){
            this.shoot();
            this.arrowEquiped = false;
        }
    }

    public void shoot(){
        // TODO: notificar a sala sobre a flecha e atirar no wumpus se ele estiver lá
        this.arrows--;
    }
}