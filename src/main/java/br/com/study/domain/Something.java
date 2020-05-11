package br.com.study.domain;

import javax.persistence.*;

@Entity
@Table(name = "something")
public class Something {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name="something_seq" , sequenceName = "something_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="something_seq")
    private Integer id;

    @Column(name = "name")
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
}
