package com.generatore.lib.genlib.enums;

import lombok.Getter;

@Getter
public enum TipoOperazioneEnum {

    CONVERSIONE_IMMAGINE("CONVERSIONE"),
    CONVERSIONE_DOCUMENTO("DOCUMENTO");

    private final String operazione;

    TipoOperazioneEnum(String operazione)
    {
        this.operazione = operazione;
    }
}
