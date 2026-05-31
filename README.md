# 📱 Splitbill — Kotlin Multiplatform (KMP) App

**Splitbill** es una aplicación móvil diseñada para calcular propinas y dividir cuentas de forma rápida y eficiente. Lo más destacado de este proyecto es que está construido bajo la arquitectura **Kotlin Multiplatform (KMP)**, compartiendo la lógica de negocio central entre **Android** e **iOS** de forma nativa.

---

## 📸 Capturas de Pantalla (iOS Simulator)

<p align="center">
  ## 📸 Capturas de Pantalla (iOS Simulator)

<p align="center">
  <img src="screenshots/SplitBill.jpg" width="30%" alt="Splitbill Home Screen"/>
  <img src="screenshots/SplitBill1.jpg" width="30%" alt="Splitbill Calculando"/>
</p>

---

## 🛠️ Stack Tecnológico & Arquitectura

* **Core:** Kotlin Multiplatform (KMP)
* **Android UI:** Jetpack Compose
* **iOS UI:** Compose Multiplatform / SwiftUI
* **Entorno de compilación:** Gradle + Xcode (enlace nativo mediante arquitectura `arm64` Apple Silicon)

---

## 🚀 Desafíos Técnicos Superados

Durante el desarrollo de este proyecto, se implementaron soluciones avanzadas de configuración de entorno, tales como:
1. **Sincronización de Entornos:** Configuración del entorno de ejecución de Java (JVM 11+) compartida entre Android Studio y los scripts de ejecución en segundo plano de Xcode (`PhaseScriptExecution`).
2. **Compatibilidad de Arquitecturas:** Resolución de conflictos de enlazado de plataformas forzando la compilación nativa para simuladores en chips Apple Silicon.

---

## ⚙️ Requisitos de Instalación

Para replicar y compilar este proyecto localmente, te sugiero contar con el siguiente entorno:

* **Sistema Operativo:** macOS 15.6 o superior (Recomendado para la simulación nativa de iOS).
* **IDE:** Android Studio (última versión) con el plugin de Kotlin Multiplatform instalado.
* **Xcode:** Versión 15+ (con soporte para el SDK de iOS correspondiente).
* **Java:** JDK 17 o superior configurado tanto en el sistema como en el entorno de Gradle.

### Pasos rápidos:
1. Clona el repositorio: `git clone https://github.com/tu-usuario/Splitbill.git`
2. Abre el proyecto raíz en Android Studio.
3. Deja que Gradle sincronice los archivos.
4. Para limpiar cualquier caché previa, ejecuta en la terminal de la raíz:
```bash
   ./gradlew clean
