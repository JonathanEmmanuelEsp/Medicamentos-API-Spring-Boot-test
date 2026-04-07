package com.example.medicamentos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MedicamentosController {

    

    @GetMapping("/")
    public String prueba(){
        return "Hola Mundo prueba";
    }



    private final List<Medicamento> medicamentos = List.of(new Medicamento(
                "Paracetamol",
                List.of("Tylenol", "Panadol"),
                List.of("Oral"),
                "500 mg cada 8 horas",
                List.of("Dolor leve", "Fiebre"),
                List.of("Insuficiencia hepática", "Alergia al paracetamol"),
                List.of("Nauseas", "Erupciones cutáneas"),
                List.of("Control hepático", "Administrar con alimentos")
            ),
            new Medicamento(
                "Ibuprofeno",
                List.of("Advil", "Motrin"),
                List.of("Oral"),
                "400 mg cada 8 horas",
                List.of("Dolor inflamatorio", "Fiebre"),
                List.of("Úlcera péptica activa", "Hipersensibilidad al AINE"),
                List.of("Mareos", "Dolor abdominal"),
                List.of("Vigilar sangrado gastrointestinal", "Administrar con alimento")
            ),
            new Medicamento(
                "Amoxicilina",
                List.of("Amoxil", "Moxatag"),
                List.of("Oral"),
                "500 mg cada 8 horas",
                List.of("Infecciones bacterianas", "Faringitis"),
                List.of("Alergia a penicilinas", "Mononucleosis infecciosa"),
                List.of("Diarrea", "Erupción"),
                List.of("Completar el tratamiento", "Evitar uso en alergia conocida")
            ),
            new Medicamento(
                "Omeprazol",
                List.of("Prilosec", "Losec"),
                List.of("Oral"),
                "20 mg una vez al día",
                List.of("Úlcera gástrica", "Reflujo gastroesofágico"),
                List.of("Hipersensibilidad al omeprazol", "Insuficiencia hepática severa"),
                List.of("Dolor abdominal", "Cefalea"),
                List.of("Administrar antes del desayuno", "Vigilar función hepática")
            ),
            new Medicamento(
                "Metformina",
                List.of("Glucophage"),
                List.of("Oral"),
                "850 mg cada 12 horas",
                List.of("Diabetes tipo 2"),
                List.of("Acidosis láctica", "Insuficiencia renal grave"),
                List.of("Nauseas", "Sabor metálico"),
                List.of("Controlar glucosa", "Administrar con alimento")
            ),
            new Medicamento(
                "Salbutamol",
                List.of("Ventolin", "Sultanol"),
                List.of("Inhalatoria"),
                "2 inhalaciones cada 6 horas",
                List.of("Asma", "Broncoespasmo"),
                List.of("Cardiopatía grave", "Hipersensibilidad al principio activo"),
                List.of("Temblor", "Taquicardia"),
                List.of("Enseñar técnica de inhalación", "Controlar frecuencia cardiaca")
            ),
            new Medicamento(
                "Enalapril",
                List.of("Vasotec"),
                List.of("Oral"),
                "5 mg una vez al día",
                List.of("Hipertensión", "Insuficiencia cardiaca"),
                List.of("Embarazo", "Angioedema previo"),
                List.of("Tos seca", "Hipotensión"),
                List.of("Controlar presión arterial", "Monitorear potasio")
            ),
            new Medicamento(
                "Loratadina",
                List.of("Claritin"),
                List.of("Oral"),
                "10 mg una vez al día",
                List.of("Rinitis alérgica", "Urticaria"),
                List.of("Hipersensibilidad a la loratadina"),
                List.of("Somnolencia", "Sequedad de boca"),
                List.of("Evitar alcohol", "Administrar en dosis única")
            ),
            new Medicamento(
                "Diclofenaco",
                List.of("Voltaren", "Cataflam"),
                List.of("Oral", "Tópica"),
                "50 mg cada 8 horas",
                List.of("Dolor articular", "Inflamación"),
                List.of("Úlcera péptica activa", "Insuficiencia renal grave"),
                List.of("Nauseas", "Dolor abdominal"),
                List.of("Administrar con alimento", "Vigilar función renal")
            ),
            new Medicamento(
                "Cefalexina",
                List.of("Keflex"),
                List.of("Oral"),
                "500 mg cada 6 horas",
                List.of("Infecciones de piel", "Infecciones urinarias"),
                List.of("Alergia a cefalosporinas", "Historia de anafilaxia"),
                List.of("Diarrea", "Mareos"),
                List.of("Completar el tratamiento", "Monitorear reacciones alérgicas")
            ));

            

            
            @GetMapping("/medicamentos")
            public List<Medicamento> getMedicamentos(){
                return medicamentos;
            }
    
    
            @GetMapping("/sintoma")
            public List<Medicamento> sintoma(@RequestParam String sintoma){
                List<Medicamento> medicamentosConSintoma = new ArrayList<>();
                for(Medicamento medicamento:medicamentos){
                    if(medicamento.getIndicaciones().contains(sintoma)){
                        medicamentosConSintoma.add(medicamento);
                    }
                }
                return medicamentosConSintoma;
            }
    
    
        }

    
    







