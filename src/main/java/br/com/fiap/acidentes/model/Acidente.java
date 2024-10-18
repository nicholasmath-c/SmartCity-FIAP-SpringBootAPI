package br.com.fiap.acidentes.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="tbl_acidentes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Acidente {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_ACIDENTES"
    )
    @SequenceGenerator(
            name = "SEQ_ACIDENTES",
            sequenceName = "SEQ_ACIDENTES",
            allocationSize = 1
    )
    @Column(name = "acidente_id")
    private Long id;
    private String endereco;
    @Column(name = "data_ocorrencia")
    private LocalDate dataOcorrencia;
    private String vitima;
    private String causador;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(LocalDate dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public String getVitima() {
        return vitima;
    }

    public void setVitima(String vitima) {
        this.vitima = vitima;
    }

    public String getCausador() {
        return causador;
    }

    public void setCausador(String causador) {
        this.causador = causador;
    }
}
