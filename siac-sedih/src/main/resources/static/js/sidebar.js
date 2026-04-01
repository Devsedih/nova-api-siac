<div th:fragment="sidebar" className="siac-sidebar">

    <!--
      Yago, esse é o topo da sidebar.
      A logo precisa estar em:
      src/main/resources/static/img/logo-ceara.png
    -->
    <div className="siac-sidebar__top">
        <img th:src="@{/img/logo-ceara.png}"
             alt="Logo SIAC"
             className="siac-sidebar__logo"/>

        <!--
          Yago, esse botão é o de fechar a sidebar no mobile.
          Depois, se tu quiser, dá para ligar ele com JS.
        -->
        <button type="button"
                className="siac-sidebar__close"
                data-bs-dismiss="offcanvas"
                aria-label="Fechar menu">
            ✕
        </button>
    </div>

    <!--
      Yago, aqui começa a navegação principal.
      Por enquanto deixei href="#".
      Depois tu troca pelas rotas reais com th:href.
    -->
    <nav className="siac-sidebar__nav">
        <ul className="siac-menu">

            <!-- Início -->
            <li className="siac-menu__item">
                <a href="#"
                   className="siac-menu__link active">
                    <span className="siac-menu__icon">🏠</span>
                    <span>Início</span>
                </a>

                <!--
                  Yago, rota futura:
                  th:href="@{/dashboard}"
                -->
            </li>

            <!-- Gerenciamento de Usuários -->
            <li className="siac-menu__item">
                <button type="button"
                        className="siac-menu__link siac-menu__toggle"
                        onClick="toggleSubmenu('submenu-usuarios')">
                    <span className="siac-menu__icon">👥</span>
                    <span className="siac-menu__text">Gerenciamento de Usuários</span>
                    <span className="siac-menu__arrow">⌄</span>
                </button>

                <ul id="submenu-usuarios" className="siac-submenu">
                    <li>
                        <a href="#"
                           className="siac-submenu__link">
                            <span>👤</span>
                            <span>Cadastro de Usuários</span>
                        </a>

                        <!--
                          Yago, rota futura:
                          th:href="@{/usuarios}"
                        -->
                    </li>

                    <li>
                        <a href="#"
                           className="siac-submenu__link">
                            <span>📋</span>
                            <span>Cadastro de Atendimentos</span>
                        </a>

                        <!--
                          Yago, rota futura:
                          th:href="@{/atendimentos}"
                        -->
                    </li>
                </ul>
            </li>

            <!-- Relatórios -->
            <li className="siac-menu__item">
                <button type="button"
                        className="siac-menu__link siac-menu__toggle"
                        onClick="toggleSubmenu('submenu-relatorios')">
                    <span className="siac-menu__icon">🧾</span>
                    <span className="siac-menu__text">Relatórios</span>
                    <span className="siac-menu__arrow">⌄</span>
                </button>

                <ul id="submenu-relatorios" className="siac-submenu">
                    <li>
                        <a href="#"
                           className="siac-submenu__link">
                            <span>🖥</span>
                            <span>Auditoria de Atendimentos</span>
                        </a>

                        <!--
                          Yago, rota futura:
                          th:href="@{/relatorios/auditoria}"
                        -->
                    </li>

                    <li>
                        <a href="#"
                           className="siac-submenu__link">
                            <span>📄</span>
                            <span>Prontuário</span>
                        </a>

                        <!--
                          Yago, rota futura:
                          th:href="@{/relatorios/prontuario}"
                        -->
                    </li>
                </ul>
            </li>

            <!-- Documentos -->
            <li className="siac-menu__item">
                <button type="button"
                        className="siac-menu__link siac-menu__toggle"
                        onClick="toggleSubmenu('submenu-documentos')">
                    <span className="siac-menu__icon">📎</span>
                    <span className="siac-menu__text">Documentos</span>
                    <span className="siac-menu__arrow">⌄</span>
                </button>

                <ul id="submenu-documentos" className="siac-submenu">
                    <li>
                        <a href="#" className="siac-submenu__link">
                            Autorização senha do processo
                        </a>

                        <!--
                          Yago, se depois isso virar modal, em vez de link:
                          tu pode usar button e chamar JS
                        -->
                    </li>

                    <li>
                        <a href="#" className="siac-submenu__link">
                            Declaração de comparecimento
                        </a>
                    </li>

                    <li>
                        <a href="#" className="siac-submenu__link">
                            Ficha de encaminhamento
                        </a>
                    </li>

                    <li>
                        <a href="#" className="siac-submenu__link">
                            Ficha de gratuidade certidão
                        </a>
                    </li>

                    <li>
                        <a href="#" className="siac-submenu__link">
                            Relatório de entrevista domiciliar
                        </a>
                    </li>
                </ul>
            </li>

            <!-- Gerenciamento de Acessos -->
            <li className="siac-menu__item">
                <a href="#"
                   className="siac-menu__link">
                    <span className="siac-menu__icon">🔐</span>
                    <span>Gerenciamento de Acessos</span>
                </a>

                <!--
                  Yago, rota futura:
                  th:href="@{/profissionais}"
                -->
            </li>

            <!-- Configurações -->
            <li className="siac-menu__item">
                <a href="#"
                   className="siac-menu__link">
                    <span className="siac-menu__icon">⚙</span>
                    <span>Configurações</span>
                </a>
            </li>

        </ul>
    </nav>

    <!--
      Yago, rodapé com usuário logado.
      Depois tu troca por dados reais do Spring Security.
    -->
    <div className="siac-sidebar__footer">
        <div className="siac-user-box">
            <img th:src="@{/img/user-default.png}"
                 alt="Usuário"
                 className="siac-user-box__avatar"/>

            <div className="siac-user-box__info">
                <p className="siac-user-box__name">Maria Helena</p>
                <p className="siac-user-box__role">Técnico(a)</p>
            </div>
        </div>
    </div>

</div>