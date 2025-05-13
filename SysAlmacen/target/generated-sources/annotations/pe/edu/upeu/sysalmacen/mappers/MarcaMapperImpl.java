package pe.edu.upeu.sysalmacen.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.edu.upeu.sysalmacen.dtos.MarcaDTO;
import pe.edu.upeu.sysalmacen.modelo.Marca;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-13T17:20:41-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.14 (Oracle Corporation)"
)
@Component
public class MarcaMapperImpl implements MarcaMapper {

    @Override
    public MarcaDTO toDTO(Marca entity) {
        if ( entity == null ) {
            return null;
        }

        MarcaDTO.MarcaDTOBuilder marcaDTO = MarcaDTO.builder();

        marcaDTO.idMarca( entity.getIdMarca() );
        marcaDTO.nombre( entity.getNombre() );

        return marcaDTO.build();
    }

    @Override
    public Marca toEntity(MarcaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Marca.MarcaBuilder marca = Marca.builder();

        marca.idMarca( dto.getIdMarca() );
        marca.nombre( dto.getNombre() );

        return marca.build();
    }

    @Override
    public List<MarcaDTO> toDTOs(List<Marca> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MarcaDTO> list = new ArrayList<MarcaDTO>( entities.size() );
        for ( Marca marca : entities ) {
            list.add( toDTO( marca ) );
        }

        return list;
    }

    @Override
    public List<Marca> toEntities(List<MarcaDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Marca> list = new ArrayList<Marca>( dtos.size() );
        for ( MarcaDTO marcaDTO : dtos ) {
            list.add( toEntity( marcaDTO ) );
        }

        return list;
    }
}
