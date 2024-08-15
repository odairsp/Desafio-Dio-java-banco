package com.odair.banco;

import lombok.*;

@Getter
@Setter
@ToString(includeFieldNames = false)
@AllArgsConstructor
public class Cliente {

    @NonNull private String nome;
    @Setter(value = AccessLevel.NONE)
    @ToString.Exclude @NonNull private String cpf;



}