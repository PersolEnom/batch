package com.generatore.lib.genlib.dto;

import com.generatore.lib.genlib.enums.TipoOperazioneEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.sql.Clob;
import java.time.LocalDate;

@Data
@Log4j2
@Entity
@SequenceGenerator(name="generatore_dato",sequenceName = "generatore_dato_seq",allocationSize = 1)
@Table(name="tabella_dato")
public class TipoDatoDto {

    @Id
    private Integer id;

    private Clob dato;

    private LocalDate dataInserimento;

    private TipoOperazioneEnum tipoOperazione;
}
