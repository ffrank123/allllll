package pe.edu.upeu.sysalmacen.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.edu.upeu.sysalmacen.dtos.ClienteDTO;
import pe.edu.upeu.sysalmacen.modelo.Cliente;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-13T17:20:40-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.14 (Oracle Corporation)"
)
@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public ClienteDTO toDTO(Cliente entity) {
        if ( entity == null ) {
            return null;
        }

        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setDniruc( entity.getDniruc() );
        clienteDTO.setNombres( entity.getNombres() );
        clienteDTO.setRepLegal( entity.getRepLegal() );
        clienteDTO.setTipoDocumento( entity.getTipoDocumento() );
        clienteDTO.setDireccion( entity.getDireccion() );

        return clienteDTO;
    }

    @Override
    public Cliente toEntity(ClienteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Cliente.ClienteBuilder cliente = Cliente.builder();

        cliente.dniruc( dto.getDniruc() );
        cliente.nombres( dto.getNombres() );
        cliente.repLegal( dto.getRepLegal() );
        cliente.tipoDocumento( dto.getTipoDocumento() );
        cliente.direccion( dto.getDireccion() );

        return cliente.build();
    }

    @Override
    public List<ClienteDTO> toDTOs(List<Cliente> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ClienteDTO> list = new ArrayList<ClienteDTO>( entities.size() );
        for ( Cliente cliente : entities ) {
            list.add( toDTO( cliente ) );
        }

        return list;
    }

    @Override
    public List<Cliente> toEntities(List<ClienteDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Cliente> list = new ArrayList<Cliente>( dtos.size() );
        for ( ClienteDTO clienteDTO : dtos ) {
            list.add( toEntity( clienteDTO ) );
        }

        return list;
    }
}
