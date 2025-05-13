package pe.edu.upeu.sysalmacen.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.edu.upeu.sysalmacen.dtos.CategoriaDTO;
import pe.edu.upeu.sysalmacen.modelo.Categoria;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-13T17:20:41-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.14 (Oracle Corporation)"
)
@Component
public class CategoriaMapperImpl implements CategoriaMapper {

    @Override
    public CategoriaDTO toDTO(Categoria entity) {
        if ( entity == null ) {
            return null;
        }

        CategoriaDTO categoriaDTO = new CategoriaDTO();

        categoriaDTO.setIdCategoria( entity.getIdCategoria() );
        categoriaDTO.setNombre( entity.getNombre() );

        return categoriaDTO;
    }

    @Override
    public Categoria toEntity(CategoriaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Categoria.CategoriaBuilder categoria = Categoria.builder();

        categoria.idCategoria( dto.getIdCategoria() );
        categoria.nombre( dto.getNombre() );

        return categoria.build();
    }

    @Override
    public List<CategoriaDTO> toDTOs(List<Categoria> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CategoriaDTO> list = new ArrayList<CategoriaDTO>( entities.size() );
        for ( Categoria categoria : entities ) {
            list.add( toDTO( categoria ) );
        }

        return list;
    }

    @Override
    public List<Categoria> toEntities(List<CategoriaDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Categoria> list = new ArrayList<Categoria>( dtos.size() );
        for ( CategoriaDTO categoriaDTO : dtos ) {
            list.add( toEntity( categoriaDTO ) );
        }

        return list;
    }
}
