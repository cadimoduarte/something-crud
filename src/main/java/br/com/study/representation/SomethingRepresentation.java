package br.com.study.representation;

import br.com.study.domain.Something;

public class SomethingRepresentation {

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public SomethingRepresentation(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static SomethingRepresentation of(Something something) {
        return new SomethingRepresentation(something.getId(), something.getName());

    }
}
