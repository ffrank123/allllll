package pe.edu.upeu.sysalmacen.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.edu.upeu.sysalmacen.dtos.CategoriaDTO;
import pe.edu.upeu.sysalmacen.dtos.ClienteDTO;
import pe.edu.upeu.sysalmacen.dtos.MarcaDTO;
import pe.edu.upeu.sysalmacen.dtos.ProductoDTO;
import pe.edu.upeu.sysalmacen.dtos.UnidadMedidaDTO;
import pe.edu.upeu.sysalmacen.dtos.UsuarioDTO;
import pe.edu.upeu.sysalmacen.dtos.VentaDTO;
import pe.edu.upeu.sysalmacen.dtos.VentaDetalleDTO;
import pe.edu.upeu.sysalmacen.modelo.Categoria;
import pe.edu.upeu.sysalmacen.modelo.Cliente;
import pe.edu.upeu.sysalmacen.modelo.Marca;
import pe.edu.upeu.sysalmacen.modelo.Producto;
import pe.edu.upeu.sysalmacen.modelo.UnidadMedida;
import pe.edu.upeu.sysalmacen.modelo.Usuario;
import pe.edu.upeu.sysalmacen.modelo.Venta;
import pe.edu.upeu.sysalmacen.modelo.VentaDetalle;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-20T17:52:55-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class VentaDetalleMapperImpl implements VentaDetalleMapper {

    @Override
    public VentaDetalleDTO toDTO(VentaDetalle entity) {
        if ( entity == null ) {
            return null;
        }

        VentaDetalleDTO ventaDetalleDTO = new VentaDetalleDTO();

        ventaDetalleDTO.setIdVentaDetalle( entity.getIdVentaDetalle() );
        ventaDetalleDTO.setPu( entity.getPu() );
        ventaDetalleDTO.setCantidad( entity.getCantidad() );
        ventaDetalleDTO.setDescuento( entity.getDescuento() );
        ventaDetalleDTO.setSubtotal( entity.getSubtotal() );
        ventaDetalleDTO.setVenta( ventaToVentaDTO( entity.getVenta() ) );
        ventaDetalleDTO.setProducto( productoToProductoDTO( entity.getProducto() ) );

        return ventaDetalleDTO;
    }

    @Override
    public VentaDetalle toEntity(VentaDetalleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VentaDetalle.VentaDetalleBuilder ventaDetalle = VentaDetalle.builder();

        ventaDetalle.idVentaDetalle( dto.getIdVentaDetalle() );
        ventaDetalle.pu( dto.getPu() );
        ventaDetalle.cantidad( dto.getCantidad() );
        ventaDetalle.descuento( dto.getDescuento() );
        ventaDetalle.subtotal( dto.getSubtotal() );
        ventaDetalle.venta( ventaDTOToVenta( dto.getVenta() ) );
        ventaDetalle.producto( productoDTOToProducto( dto.getProducto() ) );

        return ventaDetalle.build();
    }

    @Override
    public List<VentaDetalleDTO> toDTOs(List<VentaDetalle> entities) {
        if ( entities == null ) {
            return null;
        }

        List<VentaDetalleDTO> list = new ArrayList<VentaDetalleDTO>( entities.size() );
        for ( VentaDetalle ventaDetalle : entities ) {
            list.add( toDTO( ventaDetalle ) );
        }

        return list;
    }

    @Override
    public List<VentaDetalle> toEntities(List<VentaDetalleDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<VentaDetalle> list = new ArrayList<VentaDetalle>( dtos.size() );
        for ( VentaDetalleDTO ventaDetalleDTO : dtos ) {
            list.add( toEntity( ventaDetalleDTO ) );
        }

        return list;
    }

    @Override
    public VentaDetalle toEntityFromCADTO(VentaDetalleDTO.VentaDetalleCADTO ventaDetalleCADTO) {
        if ( ventaDetalleCADTO == null ) {
            return null;
        }

        VentaDetalle.VentaDetalleBuilder ventaDetalle = VentaDetalle.builder();

        ventaDetalle.idVentaDetalle( ventaDetalleCADTO.idVentaDetalle() );
        ventaDetalle.pu( ventaDetalleCADTO.pu() );
        ventaDetalle.cantidad( ventaDetalleCADTO.cantidad() );
        ventaDetalle.descuento( ventaDetalleCADTO.descuento() );
        ventaDetalle.subtotal( ventaDetalleCADTO.subtotal() );

        return ventaDetalle.build();
    }

    protected ClienteDTO clienteToClienteDTO(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setDniruc( cliente.getDniruc() );
        clienteDTO.setNombres( cliente.getNombres() );
        clienteDTO.setRepLegal( cliente.getRepLegal() );
        clienteDTO.setTipoDocumento( cliente.getTipoDocumento() );
        clienteDTO.setDireccion( cliente.getDireccion() );

        return clienteDTO;
    }

    protected UsuarioDTO usuarioToUsuarioDTO(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setIdUsuario( usuario.getIdUsuario() );
        usuarioDTO.setUser( usuario.getUser() );
        usuarioDTO.setEstado( usuario.getEstado() );

        return usuarioDTO;
    }

    protected VentaDTO ventaToVentaDTO(Venta venta) {
        if ( venta == null ) {
            return null;
        }

        VentaDTO ventaDTO = new VentaDTO();

        ventaDTO.setIdVenta( venta.getIdVenta() );
        ventaDTO.setPrecioBase( venta.getPrecioBase() );
        ventaDTO.setIgv( venta.getIgv() );
        ventaDTO.setPrecioTotal( venta.getPrecioTotal() );
        ventaDTO.setCliente( clienteToClienteDTO( venta.getCliente() ) );
        ventaDTO.setUsuario( usuarioToUsuarioDTO( venta.getUsuario() ) );
        ventaDTO.setNumDoc( venta.getNumDoc() );
        ventaDTO.setFechaGener( venta.getFechaGener() );
        ventaDTO.setSerie( venta.getSerie() );
        ventaDTO.setTipoDoc( venta.getTipoDoc() );
        ventaDTO.setVentaDetalles( toDTOs( venta.getVentaDetalles() ) );

        return ventaDTO;
    }

    protected CategoriaDTO categoriaToCategoriaDTO(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        CategoriaDTO categoriaDTO = new CategoriaDTO();

        categoriaDTO.setIdCategoria( categoria.getIdCategoria() );
        categoriaDTO.setNombre( categoria.getNombre() );

        return categoriaDTO;
    }

    protected MarcaDTO marcaToMarcaDTO(Marca marca) {
        if ( marca == null ) {
            return null;
        }

        MarcaDTO.MarcaDTOBuilder marcaDTO = MarcaDTO.builder();

        marcaDTO.idMarca( marca.getIdMarca() );
        marcaDTO.nombre( marca.getNombre() );

        return marcaDTO.build();
    }

    protected UnidadMedidaDTO unidadMedidaToUnidadMedidaDTO(UnidadMedida unidadMedida) {
        if ( unidadMedida == null ) {
            return null;
        }

        UnidadMedidaDTO unidadMedidaDTO = new UnidadMedidaDTO();

        unidadMedidaDTO.setIdUnidad( unidadMedida.getIdUnidad() );
        unidadMedidaDTO.setNombreMedida( unidadMedida.getNombreMedida() );

        return unidadMedidaDTO;
    }

    protected ProductoDTO productoToProductoDTO(Producto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoDTO productoDTO = new ProductoDTO();

        productoDTO.setIdProducto( producto.getIdProducto() );
        productoDTO.setNombre( producto.getNombre() );
        productoDTO.setPu( producto.getPu() );
        productoDTO.setPuOld( producto.getPuOld() );
        productoDTO.setUtilidad( producto.getUtilidad() );
        productoDTO.setStock( producto.getStock() );
        productoDTO.setStockOld( producto.getStockOld() );
        productoDTO.setCategoria( categoriaToCategoriaDTO( producto.getCategoria() ) );
        productoDTO.setMarca( marcaToMarcaDTO( producto.getMarca() ) );
        productoDTO.setUnidadMedida( unidadMedidaToUnidadMedidaDTO( producto.getUnidadMedida() ) );

        return productoDTO;
    }

    protected Cliente clienteDTOToCliente(ClienteDTO clienteDTO) {
        if ( clienteDTO == null ) {
            return null;
        }

        Cliente.ClienteBuilder cliente = Cliente.builder();

        cliente.dniruc( clienteDTO.getDniruc() );
        cliente.nombres( clienteDTO.getNombres() );
        cliente.repLegal( clienteDTO.getRepLegal() );
        cliente.tipoDocumento( clienteDTO.getTipoDocumento() );
        cliente.direccion( clienteDTO.getDireccion() );

        return cliente.build();
    }

    protected Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO) {
        if ( usuarioDTO == null ) {
            return null;
        }

        Usuario.UsuarioBuilder usuario = Usuario.builder();

        usuario.idUsuario( usuarioDTO.getIdUsuario() );
        usuario.user( usuarioDTO.getUser() );
        usuario.estado( usuarioDTO.getEstado() );

        return usuario.build();
    }

    protected Venta ventaDTOToVenta(VentaDTO ventaDTO) {
        if ( ventaDTO == null ) {
            return null;
        }

        Venta.VentaBuilder venta = Venta.builder();

        venta.idVenta( ventaDTO.getIdVenta() );
        venta.precioBase( ventaDTO.getPrecioBase() );
        venta.igv( ventaDTO.getIgv() );
        venta.precioTotal( ventaDTO.getPrecioTotal() );
        venta.cliente( clienteDTOToCliente( ventaDTO.getCliente() ) );
        venta.usuario( usuarioDTOToUsuario( ventaDTO.getUsuario() ) );
        venta.numDoc( ventaDTO.getNumDoc() );
        venta.fechaGener( ventaDTO.getFechaGener() );
        venta.serie( ventaDTO.getSerie() );
        venta.tipoDoc( ventaDTO.getTipoDoc() );
        venta.ventaDetalles( toEntities( ventaDTO.getVentaDetalles() ) );

        return venta.build();
    }

    protected Categoria categoriaDTOToCategoria(CategoriaDTO categoriaDTO) {
        if ( categoriaDTO == null ) {
            return null;
        }

        Categoria.CategoriaBuilder categoria = Categoria.builder();

        categoria.idCategoria( categoriaDTO.getIdCategoria() );
        categoria.nombre( categoriaDTO.getNombre() );

        return categoria.build();
    }

    protected Marca marcaDTOToMarca(MarcaDTO marcaDTO) {
        if ( marcaDTO == null ) {
            return null;
        }

        Marca.MarcaBuilder marca = Marca.builder();

        marca.idMarca( marcaDTO.getIdMarca() );
        marca.nombre( marcaDTO.getNombre() );

        return marca.build();
    }

    protected UnidadMedida unidadMedidaDTOToUnidadMedida(UnidadMedidaDTO unidadMedidaDTO) {
        if ( unidadMedidaDTO == null ) {
            return null;
        }

        UnidadMedida.UnidadMedidaBuilder unidadMedida = UnidadMedida.builder();

        unidadMedida.idUnidad( unidadMedidaDTO.getIdUnidad() );
        unidadMedida.nombreMedida( unidadMedidaDTO.getNombreMedida() );

        return unidadMedida.build();
    }

    protected Producto productoDTOToProducto(ProductoDTO productoDTO) {
        if ( productoDTO == null ) {
            return null;
        }

        Producto.ProductoBuilder producto = Producto.builder();

        producto.idProducto( productoDTO.getIdProducto() );
        producto.nombre( productoDTO.getNombre() );
        producto.pu( productoDTO.getPu() );
        producto.puOld( productoDTO.getPuOld() );
        producto.utilidad( productoDTO.getUtilidad() );
        producto.stock( productoDTO.getStock() );
        producto.stockOld( productoDTO.getStockOld() );
        producto.categoria( categoriaDTOToCategoria( productoDTO.getCategoria() ) );
        producto.marca( marcaDTOToMarca( productoDTO.getMarca() ) );
        producto.unidadMedida( unidadMedidaDTOToUnidadMedida( productoDTO.getUnidadMedida() ) );

        return producto.build();
    }
}
