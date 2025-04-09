package br.edu.ufape.hvu.repository.seeders;

import br.edu.ufape.hvu.model.*;
import br.edu.ufape.hvu.repository.*;
import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component @RequiredArgsConstructor
public class ConsultaSeeder {
    final private ConsultaRepository consultaRepository;
    final private MedicoRepository medicoRepository;
    final private FichaRepository fichaRepository;

    public void init(){
        if(consultaRepository.count() > 0){
            return;
        }
        Faker faker = new Faker();

        List<Medico> medicos = medicoRepository.findAll();

        Consulta consulta = new Consulta();
        consulta.setPesoAtual(faker.number().randomDouble(2, 1, 100));
        consulta.setIdadeAtual((double) faker.number().numberBetween(1, 20));
        consulta.setMedico(medicos.get(0));
        // Criando e adicionando fichas
        List<Ficha> fichas = fichaRepository.findAll();
        List<Ficha> duasFichasEx = Arrays.asList(fichas.get(0),fichas.get(1));
        consulta.setFicha(duasFichasEx);

        consultaRepository.save(consulta);
    }
}
