package pe.edu.upeu.sysalmacen.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.edu.upeu.sysalmacen.dtos.UsuarioDTO;
import pe.edu.upeu.sysalmacen.modelo.Usuario;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-20T17:52:55-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public UsuarioDTO toDTO(Usuario entity) {
        if ( entity == null ) {
            return null;
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setIdUsuario( entity.getIdUsuario() );
        usuarioDTO.setUser( entity.getUser() );
        usuarioDTO.setEstado( entity.getEstado() );

        return usuarioDTO;
    }

    @Override
    public Usuario toEntity(UsuarioDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Usuario.UsuarioBuilder usuario = Usuario.builder();

        usuario.idUsuario( dto.getIdUsuario() );
        usuario.user( dto.getUser() );
        usuario.estado( dto.getEstado() );

        return usuario.build();
    }

    @Override
    public List<UsuarioDTO> toDTOs(List<Usuario> entities) {
        if ( entities == null ) {
            return null;
        }

        List<UsuarioDTO> list = new ArrayList<UsuarioDTO>( entities.size() );
        for ( Usuario usuario : entities ) {
            list.add( toDTO( usuario ) );
        }

        return list;
    }

    @Override
    public List<Usuario> toEntities(List<UsuarioDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Usuario> list = new ArrayList<Usuario>( dtos.size() );
        for ( UsuarioDTO usuarioDTO : dtos ) {
            list.add( toEntity( usuarioDTO ) );
        }

        return list;
    }

    @Override
    public Usuario toEntityFromCADTO(UsuarioDTO.UsuarioCrearDto usuarioCrearDto) {
        if ( usuarioCrearDto == null ) {
            return null;
        }

        Usuario.UsuarioBuilder usuario = Usuario.builder();

        usuario.user( usuarioCrearDto.user() );
        usuario.estado( usuarioCrearDto.estado() );

        return usuario.build();
    }
}
