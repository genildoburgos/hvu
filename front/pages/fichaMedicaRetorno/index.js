import React from "react";
import { Header03 } from "@/components/Header";
import { SubHeader } from "../../src/components/SubHeader";
import Footer from "@/components/Footer";
import "@/styles/styles.css";
import FichaMedicaRetorno from "@/components/Fichas/MedicoRetorno";

function MedicoRetornoPage() {
    return(
        <div className="divPai">
            < Header03 />
            < SubHeader />
            <div className="flexStyle">
                <FichaMedicaRetorno />
            </div>
            < Footer />
        </div>
    );
}

export default MedicoRetornoPage;