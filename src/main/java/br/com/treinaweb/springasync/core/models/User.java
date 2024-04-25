package br.com.treinaweb.springasync.core.models;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User {

    @ToString.Include
    @EqualsAndHashCode.Include
    private UUID id;

    private String name;

    @ToString.Include
    private String email;

    private String password;
    
}
