package api.account.src.main.java.insper.store.account;

import lombok.Builder;

@Builder
public record AccountOut(
    String id,
    String name,
    String email
) {
}