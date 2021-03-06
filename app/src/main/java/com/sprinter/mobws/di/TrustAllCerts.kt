package com.sprinter.mobws.di

import java.security.cert.CertificateException
import java.security.cert.X509Certificate
import javax.net.ssl.X509TrustManager

class TrustAllCerts : X509TrustManager {

    @Throws(CertificateException::class)
    override fun checkClientTrusted(
        x509Certificates: Array<X509Certificate>,
        s: String
    ) {
    }

    @Throws(CertificateException::class)
    override fun checkServerTrusted(
        x509Certificates: Array<X509Certificate>,
        s: String
    ) {
    }

    override fun getAcceptedIssuers(): Array<X509Certificate> {
        return arrayOf()
    }
}
