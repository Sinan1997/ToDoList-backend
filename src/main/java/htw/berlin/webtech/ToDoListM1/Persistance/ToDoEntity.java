package htw.berlin.webtech.ToDoListM1.Persistance;

import javax.persistence.*;

@Entity(name = "toDo")
public class ToDoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name_toDo", nullable = false)
    private String nameToDo;

    @Column(name = "datum", nullable = false)
    private String datum;

    @Column(name = "complete")
    private boolean complete;

    public ToDoEntity(long id, String nameToDo, String datum, boolean complete) {
        this.id = id;
        this.nameToDo = nameToDo;
        this.datum = datum;
        this.complete = complete;
    }

    protected ToDoEntity(){
    }

    public Long getId() {
        return id;
    }

    public String getNameToDo() {
        return nameToDo;
    }

    public void setNameToDo(String nameToDo) {
        this.nameToDo = nameToDo;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public boolean getComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
