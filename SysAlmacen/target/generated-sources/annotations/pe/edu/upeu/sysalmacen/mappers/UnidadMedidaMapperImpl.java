package pe.edu.upeu.sysalmacen.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.edu.upeu.sysalmacen.dtos.UnidadMedidaDTO;
import pe.edu.upeu.sysalmacen.modelo.UnidadMedida;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-20T17:52:56-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class UnidadMedidaMapperImpl implements UnidadMedidaMapper {

    @Override
    public UnidadMedidaDTO toDTO(UnidadMedida entity) {
        if ( entity == null ) {
            return null;
        }

        UnidadMedidaDTO unidadMedidaDTO = new UnidadMedidaDTO();

        unidadMedidaDTO.setIdUnidad( entity.getIdUnidad() );
        unidadMedidaDTO.setNombreMedida( entity.getNombreMedida() );

        return unidadMedidaDTO;
    }

    @Override
    public UnidadMedida toEntity(UnidadMedidaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        UnidadMedida.UnidadMedidaBuilder unidadMedida = UnidadMedida.builder();

        unidadMedida.idUnidad( dto.getIdUnidad() );
        unidadMedida.nombreMedida( dto.getNombreMedida() );

        return unidadMedida.build();
    }

    @Override
    public List<UnidadMedidaDTO> toDTOs(List<UnidadMedida> entities) {
        if ( entities == null ) {
            return null;
        }

        List<UnidadMedidaDTO> list = new ArrayList<UnidadMedidaDTO>( entities.size() );
        for ( UnidadMedida unidadMedida : entities ) {
            list.add( toDTO( unidadMedida ) );
        }

        return list;
    }

    @Override
    public List<UnidadMedida> toEntities(List<UnidadMedidaDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<UnidadMedida> list = new ArrayList<UnidadMedida>( dtos.size() );
        for ( UnidadMedidaDTO unidadMedidaDTO : dtos ) {
            list.add( toEntity( unidadMedidaDTO ) );
        }

        return list;
    }
}
