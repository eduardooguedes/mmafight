package br.mmafight;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import br.mmafight.Lutador.Lutador;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    private String id;

    public BaseEntity() {
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Lutador)) {
            return false;
        }

        BaseEntity baseEntity = (BaseEntity) o;
        return Objects.equals(id, baseEntity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
