package service;

import model.Usuario;
import model.UsuarioInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
@Service
public class UsuarioInfoService {
    @Autowired
    private WebClient webClient;

    private final String uri = "/usuario";

    public UsuarioInfo findById(Integer id) {
        Mono<UsuarioInfo> monoUsuarioInfo = this.webClient.method(HttpMethod.GET).
                uri(uri + "/" + id).
                retrieve().
                bodyToMono(UsuarioInfo.class);
        return monoUsuarioInfo.block();
    }

    public List<UsuarioInfo> findAll() {
        Mono<List<UsuarioInfo>> monoListUsuarioInfo = this.webClient.method(HttpMethod.GET).
                uri(uri).
                retrieve().
                bodyToFlux(UsuarioInfo.class).collectList();
        return monoListUsuarioInfo.block();
    }

    public UsuarioInfo save(Usuario usuarioinfo) {
        Mono<UsuarioInfo> monoUsuarioInfo = this.webClient.method(HttpMethod.POST).
                uri(uri).
                body(BodyInserters.fromValue(usuarioinfo)).
                retrieve().
                bodyToMono(UsuarioInfo.class);
        return monoUsuarioInfo.block();
    }

    public Void delete(Integer id) {
        Mono<Void> monoVoid = this.webClient.method(HttpMethod.DELETE).
                uri(uri + "/" + id).retrieve().bodyToMono(Void.class);
        return monoVoid.block();
    }
}
