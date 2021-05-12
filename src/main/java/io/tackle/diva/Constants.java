/*
Copyright IBM Corporation 2021

Licensed under the Eclipse Public License 2.0, Version 2.0 (the "License");
you may not use this file except in compliance with the License.

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package io.tackle.diva;

import com.ibm.wala.types.TypeName;
import com.ibm.wala.util.strings.Atom;

public interface Constants {

    Atom getParameter = Atom.findOrCreateUnicodeAtom("getParameter");
    Atom prepareStatement = Atom.findOrCreateUnicodeAtom("prepareStatement");
    Atom prepareCall = Atom.findOrCreateUnicodeAtom("prepareCall");
    Atom executeQuery = Atom.findOrCreateUnicodeAtom("executeQuery");
    Atom executeUpdate = Atom.findOrCreateUnicodeAtom("executeUpdate");

    Atom commit = Atom.findOrCreateUnicodeAtom("commit");
    Atom rollback = Atom.findOrCreateUnicodeAtom("rollback");

    Atom doGet = Atom.findOrCreateUnicodeAtom("doGet");
    Atom doPost = Atom.findOrCreateUnicodeAtom("doPost");
    Atom doDelete = Atom.findOrCreateUnicodeAtom("doDelete");
    Atom doPut = Atom.findOrCreateUnicodeAtom("doPut");
    Atom doFilter = Atom.findOrCreateUnicodeAtom("doFilter");
    Atom process = Atom.findOrCreateUnicodeAtom("process");
    Atom init = Atom.findOrCreateUnicodeAtom("init");
    Atom service = Atom.findOrCreateUnicodeAtom("service");

    TypeName LJavaSqlConnection = TypeName.findOrCreate("Ljava/sql/Connection");
    TypeName LJavaLangString = TypeName.findOrCreate("Ljava/lang/String");

}